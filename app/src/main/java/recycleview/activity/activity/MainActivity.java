package recycleview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import me.dio.recycleview.R;
import recycleview.activity.Model.Filme;
import recycleview.activity.adapter.Adapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List <Filme> listafilmes = new ArrayList<>();


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecycleView);



        Adapter adapter = new Adapter(listafilmes);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );

    }

    public void criarfilmes(){

        Filme filme = new Filme ("titulo", "genero", "2017");

        filme =         new Filme("MULHER MARAVILHA", "FANTASIA", "2017" );
        filme =         new Filme("PICA-´PAU", "COMEDIA/ANIMAÇÃO", "2017" );
        filme =         new Filme("A MUMIA", "TERROR", "2017" );
        filme =         new Filme("A BELA E A FERA", "ROMANCE", "2017" );
        filme =         new Filme("MEU MALVADO FAVORITO 3", "COMÉDIA", "2017" );
        filme =         new Filme("CARROS 3", "COMÉDIA", "2017" );
        filme =         new Filme("LIGA DA JUSTIÇA", "FICCAO", "2017" );
        filme =         new Filme("IT: A COISA", "DRAMA/TERROR", "2017" );
        filme =         new Filme("HOMEM ARANHA - DE VOLTA AO LAR", "AVENTURA", "2017" );

        this.listafilmes.add( filme );

    }
}