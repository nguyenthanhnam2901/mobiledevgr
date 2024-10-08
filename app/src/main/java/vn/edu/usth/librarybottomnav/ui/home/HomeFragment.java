package vn.edu.usth.librarybottomnav.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import vn.edu.usth.librarybottomnav.R;
import vn.edu.usth.librarybottomnav.ui.recycler.ChildModelClass;
import vn.edu.usth.librarybottomnav.ui.recycler.ParentAdapterHorizontal;
import vn.edu.usth.librarybottomnav.ui.recycler.ParentModelClass;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ParentModelClass> parentModelClassArrayList;
    ArrayList<ChildModelClass> childModelClassArrayList;
    ArrayList<ChildModelClass> favouriteList;
    ArrayList<ChildModelClass> recentlyWatchedList;
    ArrayList<ChildModelClass> latestList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.rv_parent);
        childModelClassArrayList = new ArrayList<>();
        favouriteList = new ArrayList<>();
        recentlyWatchedList = new ArrayList<>();
        latestList = new ArrayList<>();
        parentModelClassArrayList = new ArrayList<>();

        ParentAdapterHorizontal parentAdapterHorizontal;

        // Add items to latestList
        latestList.add(new ChildModelClass(R.drawable.book1, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book2, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book3, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book4, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book5, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book6, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book7, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book8, "Title", "Author", "Description"));
        latestList.add(new ChildModelClass(R.drawable.book9, "Title", "Author", "Description"));

        parentModelClassArrayList.add(new ParentModelClass("Latest Books", latestList));

        // Add items to recentlyWatchedList
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book1, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book2, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book3, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book4, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book5, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book6, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book7, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book8, "Title", "Author", "Description"));
        recentlyWatchedList.add(new ChildModelClass(R.drawable.book9, "Title", "Author", "Description"));

        parentModelClassArrayList.add(new ParentModelClass("Recently Read", recentlyWatchedList));

        // Add items to favouriteList
        favouriteList.add(new ChildModelClass(R.drawable.book1, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book2, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book3, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book4, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book5, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book6, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book7, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book8, "Title", "Author", "Description"));
        favouriteList.add(new ChildModelClass(R.drawable.book9, "Title", "Author", "Description"));

        parentModelClassArrayList.add(new ParentModelClass("Favorites", favouriteList));

        // Add items to childModelClassArrayList
        childModelClassArrayList.clear();
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book1, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book2, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book3, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book4, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book5, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book6, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book7, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book8, "Title", "Author", "Description"));
        childModelClassArrayList.add(new ChildModelClass(R.drawable.book9, "Title", "Author", "Description"));

        parentModelClassArrayList.add(new ParentModelClass("Fine", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Recently", childModelClassArrayList));
        parentModelClassArrayList.add(new ParentModelClass("Great", childModelClassArrayList));


        // Set up the adapter
        parentAdapterHorizontal = new ParentAdapterHorizontal(parentModelClassArrayList, requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(parentAdapterHorizontal);
        parentAdapterHorizontal.notifyDataSetChanged();

        return view;
    }
}
