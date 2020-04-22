package vn.edu.ntu.chauhoang.nguyenngocchauhoang_59130798_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

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
    private void AddEvent()
    {
        btnXN.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tienHanh();
            }
        });
    }

    private void tienHanh()
    {
        String Ketqua = "";
        Ketqua = edtHoTen.getText() + "\n" +
                "Ngày sinh: " + edtNgaySinh.getText() + "\n";
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rbNam: Ketqua += "Giới tính: " + "Nam" + "\n" + "Sở thích: "; break;
            case R.id.rbNu: Ketqua += "Giới tính: " + "Nữ" + "\n" + "Sở thích: "; break;
        }

        //Gọi hàm thực thi checkbox
        Ketqua += HDCheckBox();
        Toast.makeText(MainActivity.this, Ketqua, Toast.LENGTH_SHORT).show();
    }

    private String HDCheckBox()
    {
        String Ketqua="";
        CheckBox [] arrCb = new CheckBox[]{cbXP, cbNN, cbCF, cbONha, cbVB};
        for(int i = 0; i < arrCb.length; i++)
        {
            if(arrCb[i].isChecked())
            {
                Ketqua += arrCb[i].getText().toString() + "; ";
            }
        }

        //Thêm sở thích khác vào Ketqua nếu có
        Ketqua += edtSThich.getText();
        return Ketqua;
    }
}
