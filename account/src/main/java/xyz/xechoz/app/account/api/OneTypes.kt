package xyz.xechoz.app.account.api

/**
 * Created by xechoz.zheng on 15/08/2017.
 * Email: xechoz.zheng@gmail.com
 * 功能:
 * 文档:
 */
object OneTypes {
    const val ALL = -1
    const val BASE = 0x01
    const val WeChat = BASE.shl(1)
    const val QQ = BASE.shl(2)
    const val WeiBo = BASE.shl(3)
    const val INTERNAL_TYPES_BEGIN= BASE.shl(6)
    const val INTERNAL_TYPES_END: Int = BASE.shl(8)
}