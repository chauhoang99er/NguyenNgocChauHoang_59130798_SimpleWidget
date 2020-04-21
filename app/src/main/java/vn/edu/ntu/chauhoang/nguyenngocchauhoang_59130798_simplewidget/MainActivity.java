package vn.edu.ntu.chauhoang.nguyenngocchauhoang_59130798_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity
{
    EditText edtHoTen, edtNgaySinh, edtSThich;
    RadioGroup rdgGioiTinh;
    CheckBox cbXP, cbNN, cbCF, cbONha, cbVB;
    Button btnXN;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Gọi Phương Thức
        AddView();
        AddEvent();
    }

    private void AddView()
    {
        edtHoTen = findViewById(R.id.edtHoTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSThich = findViewById(R.id.edtSthich);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        cbXP = findViewById(R.id.cbXP);
        cbNN = findViewById(R.id.cbNN);
        cbCF = findViewById(R.id.cbCF);
        cbONha = findViewById(R.id.cbONha);
        cbVB = findViewById(R.id.cbVB);
        btnXN = findViewById(R.id.btnXN);
    }

    //Sự kiện khi nhấn nút
}
