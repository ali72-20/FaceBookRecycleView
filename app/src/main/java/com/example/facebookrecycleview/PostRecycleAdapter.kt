package com.example.facebookrecycleview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostRecycleAdapter(val items:List<Posts>) : RecyclerView.Adapter<PostRecycleAdapter.ViewHolder>() {

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val userName : TextView = itemView.findViewById(R.id.tv_username)
        val time : TextView = itemView.findViewById(R.id.tv_time)
        val postContent : TextView= itemView.findViewById(R.id.tv_post_content)
        val like : TextView = itemView.findViewById(R.id.tv_Like)
        val comment:TextView = itemView.findViewById(R.id.tv_Comment)
        val share :TextView= itemView.findViewById(R.id.Share)
        val likes :TextView= itemView.findViewById(R.id.likesNumbers)
        val shares : TextView = itemView.findViewById(R.id.tv_share_numbres)
        val profileImage:ImageView =itemView.findViewById(R.id.Img_profile)
        val public:ImageView = itemView.findViewById(R.id.img_public)
        val menu : ImageView = itemView.findViewById(R.id.img_menu)
        val postImage: ImageView = itemView.findViewById(R.id.Img_post)
        val likeImageBlue:ImageView = itemView.findViewById(R.id.img_post_likes)
        val miniPofileImage : ImageView =  itemView.findViewById(R.id.img_mini_profile_picture)
        val LikeButton:ImageView = itemView.findViewById(R.id.img_likebutton)
        val commentButton:ImageView = itemView.findViewById(R.id.img_commentbutton)
        val shareButton : ImageView = itemView.findViewById(R.id.img_sharebutton)
        val downArrow : ImageView = itemView.findViewById(R.id.img_sharebutton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView :View = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = items.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Posts = items[position]
        holder.userName.text = item.userName
        holder.time.text = item.time
        holder.postContent.text = item.postContent
        holder.like.text = item.like
        holder.likes.text = item.likes
        holder.comment.text = item.comment
        holder.share.text = item.share
        holder.shares.text = item.shares
        holder.profileImage.setImageResource(item.profileImage)
        holder.public.setImageResource(item.public)
        holder.menu.setImageResource(item.menu)
        holder.postImage.setImageResource(item.postImage)
        holder.likeImageBlue.setImageResource(item.likeImageBlue)
        holder.miniPofileImage.setImageResource(item.miniPofileImage)
        holder.downArrow.setImageResource(item.downArrow)
        holder.LikeButton.setImageResource(item.LikeButton)
        holder.commentButton.setImageResource(item.commentButton)
        holder.shareButton.setImageResource(item.shareButton)
    }
}


