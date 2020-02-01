package nuffsaidm8.me.assignme.frags;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import nuffsaidm8.me.assignme.R;
import nuffsaidm8.me.assignme.activities.GroupContentActivity;

public class GroupTasksFragment extends Fragment {

    public ArrayAdapter<String> adapter;
    private Context context;
    public ListView taskListView;
    public List<String> adapterContent = new ArrayList<>();

    public GroupTasksFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_group_tasks, container, false);
        taskListView = rootView.findViewById(R.id.tasksList);
        adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, adapterContent);
        taskListView.setAdapter(adapter);
        taskListView.setSelection(taskListView.getCount() - 1);
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void addTask(View view){
        Activity act = getActivity();
        if (act instanceof GroupContentActivity)
            ((GroupContentActivity) act).addTask(view);
    }

    public void deleteTask(View view){
        Activity act = getActivity();
        if (act instanceof GroupContentActivity)
            ((GroupContentActivity) act).deleteTask(view);
    }

    public void goHome(View view){
        Activity act = getActivity();
        if (act instanceof GroupContentActivity)
            ((GroupContentActivity) act).goHome(view);
    }
}
