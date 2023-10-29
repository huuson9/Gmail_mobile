package com.example.gmailkt


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListAdapter
import android.widget.ListView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: ListAdapter
    private lateinit var gmail: Gmail
    var dataArrayList = ArrayList<Gmail?>()

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar = findViewById<Toolbar>(R.id.my_toolbar)
        setSupportActionBar(toolbar)
        var listImage = intArrayOf(
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
            R.drawable._02c2a_8e9a35734afd4c37b61da779354c0968_mv2,
        )
        var title = arrayOf(
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
            "PAPAKEN",
        )

        var summary = arrayOf(
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
            "Con gái lai Nhật-Việt và ông bố người Nhật thử sức nấu ăn nhưng chỉ nói tiếng Việt",
        )

        var content = arrayOf(
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
            "日越ハーフの娘と日本人のパパ、ベトナム語だけで料理に挑戦 PPK：Hôm nay MI nấu gì? 今日みーちゃんは何を作るの？ Mi：Nấu Karaage (Gà rán) 唐揚げを作る PPK：Đúng rồi そう MI：PAPA ơi Làm như thế... ",
        )

        for(i in listImage.indices){
            gmail = Gmail(
                title[i],summary[i],content[i], listImage[i]
            )
            dataArrayList.add(gmail)
        }

        listAdapter = GmailAdapter(this@MainActivity,dataArrayList)
        var listview = findViewById<ListView>(R.id.listgmail)
        listview.adapter = listAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}