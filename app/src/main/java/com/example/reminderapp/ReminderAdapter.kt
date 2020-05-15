package com.example.reminderapp
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reminderapp.Data.Reminder
import kotlinx.android.synthetic.main.item_reminder.view.*

/**
 * Adapter class for reminder
 */

class ReminderAdapter(private val reminders: List<Reminder>) : RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

           fun bind(reminder: Reminder) {
            itemView.tvReminder.text = reminder.reminderText
        }
    }
// onCreateViewHolder: Called when RecyclerView needs a new RecyclerView.ViewHolder.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_reminder, parent, false)
        )
    }

    // get array size
    override fun getItemCount(): Int {
        return reminders.size
    }
//  Called by RecyclerView to bind the data with the specified position.
//  The bind method made in the previous step is used.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(reminders[position])
    }


}



