package id.simplify.prosperoinv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dummy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
    }

    public void gopengadaan(View view) {
        Intent a = new Intent(dummy.this, id.simplify.prosperoinv.pengadaan.Pengadaan3Activity.class);
        startActivity(a);
    }

    public void goproduksi(View view) {
        Intent b = new Intent(dummy.this, id.simplify.prosperoinv.produksi.produksi.class);
        startActivity(b);
    }

    public void godistribusi(View view) {
    }

    public void golayanan(View view) {
    }

    public void gopenjualan(View view) {
    }
}
