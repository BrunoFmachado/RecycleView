package recycleview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.dio.recycleview.R;
import recycleview.activity.Model.Filme;


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;
    public Adapter(List<Filme> lista) {

        this.listaFilmes = lista;
    }

    @NonNull
        @Override
        public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View Itemlista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list, parent, false);

            return new MyViewHolder(Itemlista);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {

        Filme filme = listaFilmes.get(position);

            holder.titulo.setText(filme.getTituloFilme());
            holder.ano.setText(filme.getAno());
            holder.genero.setText(filme.getGenero());

        }

        @Override
        public int getItemCount() {
            return listaFilmes.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView titulo;
            TextView ano;
            TextView genero;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                titulo =    itemView.findViewById(R.id.TextTitulo);
                ano =       itemView.findViewById(R.id.TextAno);
                genero =    itemView.findViewById(R.id.TextGenero);



            }
        }
    }




