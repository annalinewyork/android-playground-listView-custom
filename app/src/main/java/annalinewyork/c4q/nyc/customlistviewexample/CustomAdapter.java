package annalinewyork.c4q.nyc.customlistviewexample;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//Why here is not public class?
//create an array adapter. taking an array convert into custom view.
class CustomAdapter extends ArrayAdapter<String> {

    //constructor. whenever make an arrayAdapter, trying to convert code to view.
    CustomAdapter(Context context, String[] name) {
        super(context,R.layout.custom_row, name);
    }

//    Integer[] imageId = {
//            R.drawable.fj,
//            R.drawable.fj2,
//    };

    //use method getView. the way I wanna me String to layout.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row,parent,false);

        String sigleNameItem = getItem(position);
        TextView textView = (TextView)customView.findViewById(R.id.listViewText1);
        ImageView imgView = (ImageView)customView.findViewById(R.id.imageView);

        textView.setText(sigleNameItem);
       // imgView.setImageResource(imageId.);

        return customView;
    }
}
