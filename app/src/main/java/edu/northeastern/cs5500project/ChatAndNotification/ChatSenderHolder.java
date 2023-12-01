package edu.northeastern.cs5500project.ChatAndNotification;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.northeastern.cs5500project.R;

public class ChatSenderHolder extends RecyclerView.ViewHolder  {
    ImageView iv_imageView;

    public ChatSenderHolder(@NonNull View itemView) {
        super(itemView);
        iv_imageView = itemView.findViewById(R.id.sender_img);
    }
}