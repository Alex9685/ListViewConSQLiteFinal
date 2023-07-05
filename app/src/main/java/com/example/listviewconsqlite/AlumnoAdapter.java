package com.example.listviewconsqlite;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder> {
    private List<Alumno> listaAlumnos;
    private Context context;

    public AlumnoAdapter(Context context, List<Alumno> listaAlumnos) {
        this.context = context;
        this.listaAlumnos = listaAlumnos;
    }

    @NonNull
    @Override
    public AlumnoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_alumno, parent, false);
        return new AlumnoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlumnoViewHolder holder, int position) {
        Alumno alumno = listaAlumnos.get(position);
        holder.bind(alumno);
    }

    @Override
    public int getItemCount() {
        return listaAlumnos.size();
    }

    public class AlumnoViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewNombre;
        private TextView textViewMatricula;

        private TextView textViewCarrera;

        public AlumnoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewMatricula = itemView.findViewById(R.id.textViewMatricula);
            textViewCarrera = itemView.findViewById(R.id.textViewCarrera);
        }

        public void bind(Alumno alumno) {
            textViewNombre.setText(alumno.getNombre());
            textViewMatricula.setText(alumno.getMatricula());
            textViewCarrera.setText(alumno.getCarrera());


            if (alumno.getFoto() != null) {
                Bitmap bitmap = BitmapFactory.decodeByteArray(alumno.getFoto(), 0, alumno.getFoto().length);
                Glide.with(context)
                        .load(bitmap)
                        .into(imageView);
            } else {


            }
        }
    }
}
