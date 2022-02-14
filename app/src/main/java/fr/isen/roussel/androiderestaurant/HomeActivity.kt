package fr.isen.roussel.androiderestaurant


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import fr.isen.roussel.androiderestaurant.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_home)
        listenClick()

        Log.d("Life cycle", "HomeActivity onCreate")
    }

    private fun listenClick(){
        binding.buttonStater.setOnClickListener {
            showCategory(LunchType.STARTER)
        }
        binding.buttonMain.setOnClickListener {
            showCategory(LunchType.MAIN)
        }
        binding.buttonFinish.setOnClickListener {
            showCategory(LunchType.FINISH)
        }
    }

    private fun showCategory(item: LunchType){
        val indent = Intent(this, CategoryActivity::class.java)
        intent.putExtra(HomeActivity.CategoryType, item)
        startActivity(indent)
    }

    override fun onDestroy() {
        Log.d("life cycle", "HomeActivity onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("life cycle", "HomeActivity onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life cycle", "HomeActivity onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("life cycle", "HomeActivity onStart")
    }

    override fun onStop() {
        Log.d("life cycle", "HomeActivity onStop")
        super.onStop()
    }

    companion object {
        const val CategoryType = "CategoryType"
    }
}