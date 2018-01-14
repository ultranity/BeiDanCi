package cn.jk.beidanci.choosebook

import cn.jk.beidanci.BaseContract
import cn.jk.beidanci.BasePresenter
import cn.jk.beidanci.BaseView
import cn.jk.beidanci.data.model.Book
import cn.jk.beidanci.data.model.BooksResult

/**
 * Created by jack on 2018/1/10.
 */
interface ChooseBookContract : BaseContract {
    interface View : BaseView {
        fun showBookList(bookResult: BooksResult)
        fun showLoad()
        fun hideLoad()
        fun showNetError()
        fun showDownLoad()
        fun hideDownLoad()

    }

    interface Presenter : BasePresenter {
        override fun stop()
        fun downloadBook(book: Book)
    }

}