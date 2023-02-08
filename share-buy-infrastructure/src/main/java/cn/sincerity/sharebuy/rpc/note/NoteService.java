package cn.sincerity.sharebuy.rpc.note;

/**
 * NoteService: 笔记服务定义
 *
 * @author Ht7_Sincerity
 * @since 2023/2/2
 */
public interface NoteService {

    /**
     * 获取当前用户的笔记数量
     * @return 数量
     */
    Integer count();
}
