package com.example.courseactivity

class CoursesRecyclerViewAdapter(val coursesList: List<Courses>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.CoursesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_name_item, parent, false)
        return CoursesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesList.size
    }
    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        holder.rowView.tvName.text = namesList[position].toString()
    }