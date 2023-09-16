package iago.slopes.applistacontato.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import iago.slopes.applistacontato.R
import iago.slopes.applistacontato.models.Contato

class AdapterContatos(var context: Context, var listaContatos: List<Contato>): RecyclerView.Adapter<AdapterContatos.viewholder>() {
    class viewholder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var inflater:LayoutInflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.contato_item, parent, false)

        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val contato:Contato = listaContatos.elementAt(position)
        val txtNome:TextView = holder.itemView.findViewById(R.id.txtNome)
        val txtTelefone:TextView = holder.itemView.findViewById(R.id.txtTelefone)
        txtNome.text = contato.nome
        txtTelefone.text = contato.telefone
    }

    override fun getItemCount(): Int {
        return this.listaContatos.size
    }

}