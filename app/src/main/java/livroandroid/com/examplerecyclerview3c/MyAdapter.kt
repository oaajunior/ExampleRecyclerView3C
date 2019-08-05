package livroandroid.com.examplerecyclerview3c

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.lista_alunos.view.*
import java.io.File

class MyAdapter(var lista : MutableList<Aluno>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.lista_alunos, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.nome.text = lista[position].nome
        holder.sobrenome.text = lista[position].sobrenome
        holder.avatar.setImageResource(lista[position].avatar)
    }


    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        var nome = itemView.txtNome
        var sobrenome = itemView.txtSobreNome
        var avatar = itemView.imgAvatar
        var listaView = itemView.viewLista
    }
}