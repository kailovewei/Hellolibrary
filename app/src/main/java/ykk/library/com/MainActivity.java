package ykk.library.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ykk.library.com.library.CustomUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //最简单的library，完成本地的调用。
        //如何在 JitPack.io Publish Android Library,这是问题的重点。
        Log.d(TAG,"Hreo say:"+ CustomUtil.getMyHero());
    }
}
