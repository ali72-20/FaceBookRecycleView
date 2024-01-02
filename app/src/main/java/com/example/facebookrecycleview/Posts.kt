package com.example.facebookrecycleview

data class Posts(
    var userName : String = "Unblast",
    var time : String = "2 hrs.",
    var postContent :String = "Buckle up, because change is coming to WordPress\nhttp://unblast.com/color-schemes",
    var like : String = "Like",
    var comment : String = "Comment",
    var share : String = "Share",
    var likes : String = "12",
    var shares : String = "1 Share",
    var profileImage:Int =R.drawable.pikachu,
    var public:Int = R.drawable.globeearth,
    var menu : Int = R.drawable.menudots,
    var postImage: Int = R.drawable.pic,
    var likeImageBlue:Int = R.drawable.like,
    var miniPofileImage : Int= R.drawable.pikachu,
    var LikeButton:Int = R.drawable.like1,
    var commentButton:Int = R.drawable.coment,
    var shareButton : Int = R.drawable.share,
    var downArrow : Int = R.drawable.downarrow
)