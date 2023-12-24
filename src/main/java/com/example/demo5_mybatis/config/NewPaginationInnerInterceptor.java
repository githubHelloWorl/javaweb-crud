package com.example.demo5_mybatis.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewPaginationInnerInterceptor extends PaginationInnerInterceptor {
    private DbType dbType;

    // 设置数据库类型
    public NewPaginationInnerInterceptor(DbType dbType) {
        this.dbType = dbType;
    }

    // 重写了 handlerOverflow 方法，在分页查询超出最大页码时，将当前页码调整为前一页。
    @Override
    protected void handlerOverflow(IPage<?> page) {
        page.setCurrent(page.getCurrent()-1);
    }
}


