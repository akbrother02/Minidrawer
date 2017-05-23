package loadingdata.ashish.minidrawer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class MenuListAdapter extends ArrayAdapter<MenuActionItem> {

    int resource;
    Activity activity;

    public MenuListAdapter(int resource, Activity activity, MenuActionItem[] items) {
        super(activity, resource, items);

        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (rowView == null) {
            rowView = activity.getLayoutInflater().inflate(resource, null);

            MenuItemViewHolder viewHolder = new MenuItemViewHolder();

            viewHolder.menuItemImageView = (ImageView) rowView.findViewById(R.id.menu_item_image_view);
            rowView.setTag(viewHolder);
        }

        MenuItemViewHolder holder = (MenuItemViewHolder) rowView.getTag();
        if (position == MenuActionItem.ITEM1.ordinal()) {
            holder.menuItemImageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.ic_payment_white_24dp));
        } else if (position == MenuActionItem.ITEM2.ordinal()) {
            holder.menuItemImageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.ic_pets_white_24dp));
        } else if (position == MenuActionItem.ITEM3.ordinal()) {
            holder.menuItemImageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.ic_receipt_white_24dp));
        } else if (position == MenuActionItem.ITEM4.ordinal()) {
            holder.menuItemImageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.ic_shopping_cart_white_24dp));
        } else if (position == MenuActionItem.ITEM5.ordinal()) {
            holder.menuItemImageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.ic_work_white_24dp));
        }


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class fragmentclass;
                switch (position) {
                    case 0:
                        fragmentclass = BlankFragment.class;
                        ((MainActivity) activity).startFragment(fragmentclass);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
            }
        });


        return rowView;
    }


    private static class MenuItemViewHolder {
        public ImageView menuItemImageView;
    }
}