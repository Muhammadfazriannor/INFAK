package com.example.infak;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private TextView tvSaldo;
    private TextView tvNamaPengguna;
    private ListView lvRiwayat;
    private RiwayatAdapter adapter;
    private List<String> riwayatList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvNamaPengguna = findViewById(R.id.tvNamaPengguna);
        tvSaldo = findViewById(R.id.tvSaldo);
        lvRiwayat = findViewById(R.id.lvRiwayat);

        // Simulasi data awal
        updateSaldo();
        loadRiwayat();

        // Event listener bisa ditambahkan sesuai kebutuhan
    }

    private void updateSaldo() {
        // Simulasi saldo dari database atau IoT
        int saldo = 125000;
        tvSaldo.setText("Rp " + saldo);
    }

    private void loadRiwayat() {
        // Simulasi riwayat transaksi
        riwayatList = new ArrayList<>();
        riwayatList.add("Tambah Rp 50.000");
        riwayatList.add("Tarik Rp 25.000");
        riwayatList.add("Tambah Rp 10.000");

        adapter = new RiwayatAdapter(this, riwayatList);
        lvRiwayat.setAdapter(adapter);
    }

    public void onTopUpClick(View view) {
        // Aksi untuk top up saldo
    }

    public void onTransferClick(View view) {
        // Aksi untuk transfer
    }

    public void onHistoryClick(View view) {
        // Aksi untuk melihat riwayat lebih lengkap
    }
}
