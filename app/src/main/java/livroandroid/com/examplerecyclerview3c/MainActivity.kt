package livroandroid.com.examplerecyclerview3c

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = mutableListOf<Aluno>()
        var avatar = (R.drawable.avatar_android)
        for(i in 1..100){
            lista.add(Aluno("João $i", "Pedro $i", avatar))
        }

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(lista)

         rvLista.adapter = viewAdapter
         rvLista.layoutManager = viewManager

    }


}
