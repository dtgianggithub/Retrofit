package com.example.giangdam.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.giangdam.model.Desire;
import com.example.giangdam.model.ProductBound;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView lblContent;

    Button btnGet;

    EditText txtProductCatalogueID,txtpageSize,txtUserID,txtCountryCode,txtPageIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblContent = (TextView) findViewById(R.id.lblContent);
        txtProductCatalogueID = (EditText)findViewById(R.id.txtProductCatalogueID);
        txtpageSize = (EditText)findViewById(R.id.txtpageSize);
        txtUserID = (EditText)findViewById(R.id.txtUserID);
        txtCountryCode = (EditText)findViewById(R.id.txtCountryCode);
        txtPageIndex = (EditText)findViewById(R.id.txtPageIndex);
        btnGet = (Button)findViewById(R.id.btnGet);
        btnGet.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        String API = "http://dev.m.api.buydesire.com";

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();                                        //create an adapter for retrofit with base url

        BuyDesireService buyDesireService = restAdapter.create(BuyDesireService.class);

        int agrs1 = Integer.parseInt(txtProductCatalogueID.getText().toString());
        int agrs2 = Integer.parseInt(txtpageSize.getText().toString());
        int agrs3 =  Integer.parseInt(txtUserID.getText().toString());
        String agrs4 = txtCountryCode.getText().toString();
        int agrs5 = Integer.parseInt(txtPageIndex.getText().toString());

        //0 10 1661 VN 0

        buyDesireService.getFeed(agrs1, agrs2, agrs3, agrs4, agrs5, new Callback<ProductBound>() {
            @Override
            public void success(ProductBound productBound, Response response) {
                List<Desire> list = productBound.getDesires();
                for(Desire desire: list){
                    lblContent.append(desire.getProductName() + "\n");
                }
            }

            @Override
            public void failure(RetrofitError error) {
                    lblContent.setText("Error");
            }
        });



    }
}


