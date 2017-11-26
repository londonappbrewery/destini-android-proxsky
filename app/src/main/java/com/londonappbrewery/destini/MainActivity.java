package com.londonappbrewery.destini;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mStoreIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView)findViewById(R.id.storyTextView);
        mTopButton = (Button)findViewById(R.id.buttonTop);
        mBottomButton = (Button)findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoreIndex==1)
                {
                    mTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoreIndex = 3;
                }
                else if(mStoreIndex==2) {

                    mTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoreIndex = 3;
                }
                else if(mStoreIndex==3)
                {
                    mTextView.setText(R.string.T6_End);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(mStoreIndex==1)
                {
                    mTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoreIndex = 2;
                }
                else if(mStoreIndex==2) {

                    mTextView.setText(R.string.T4_End);

                }
                else if(mStoreIndex==3)
                {
                    mTextView.setText(R.string.T5_End);
                }

            }
        });

    }
}
