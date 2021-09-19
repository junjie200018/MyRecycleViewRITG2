package my.edu.tarc.myrecycleviewritg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.myrecycleviewritg2.data.Product
import my.edu.tarc.myrecycleviewritg2.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Apple", 2.50, R.drawable.ic_baseline_adb_24),
            Product("Durian", 100.0, R.drawable.ic_baseline_adb_24),
            Product("DataKang",  200.0, R.drawable.ic_baseline_adb_24)
        )

        val myRecyclerView : RecyclerView = findViewById(R.id.productRecycleView)
        myRecyclerView.adapter = ProductAdapter(productList)
        myRecyclerView.setHasFixedSize(true)
    }
}