package iago.slopes.applistacontato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import iago.slopes.applistacontato.adapters.AdapterContatos
import iago.slopes.applistacontato.models.Contato

class MainActivity : AppCompatActivity() {
    lateinit var recyclerContatos:RecyclerView;
    lateinit var listaContato: ArrayList<Contato>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerContatos = findViewById(R.id.recyclerContatos)
        listaContato = ArrayList<Contato>(0)

        var contato1:Contato = Contato("Fulano", "fulano@tanto.faz", "00 1234-5678", "rua ate que a morte nos separe", "")
        var contato2:Contato = Contato("beltrano", "b@tanto.faz", "00 1324-5678", "rua ate que a morte nos separe 2", "")
        var contato3:Contato = Contato("ciclano", "c@tanto.faz", "00 1324-8756", "rua ate que a morte nos separe 3", "")
        listaContato.add(contato1)
        listaContato.add(contato2)
        listaContato.add(contato3)

        recyclerContatos.adapter = AdapterContatos(this, listaContato)
        recyclerContatos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}