package cn.jk.beidanci.wordlist

import cn.jk.beidanci.data.model.DbWord

/**
 * Created by jack on 2018/1/20.
 * 存放需要传递的word list对象
 */

object ShowWordListHelper {
    var title = ""
    lateinit var dbWordList: MutableList<DbWord>
//    var showDeleteIcon = true
//    var showCollectIcon = true
}
