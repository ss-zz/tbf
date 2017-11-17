package cn.com.sinosoft.tbf.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;

/**
 * 数据库数据变化监听
 *
 * @author lizhiyong
 *
 */
public class TbfRepositoryEventListener<T> extends AbstractRepositoryEventListener<T> {

	protected static Logger logger = LoggerFactory.getLogger(TbfRepositoryEventListener.class);

	/**
	 * 数据创建前
	 */
	@Override
	protected void onBeforeCreate(T entity) {
		logger.debug("准备创建数据：" + entity.toString());
		super.onBeforeCreate(entity);
	}

	/**
	 * 数据创建后
	 */
	@Override
	protected void onAfterCreate(T entity) {
		logger.debug("数据创建完成：" + entity.toString());
		super.onAfterCreate(entity);
	}

	/**
	 * 数据更新前
	 */
	@Override
	protected void onBeforeSave(T entity) {
		logger.debug("准备更新数据：" + entity.toString());
		super.onBeforeSave(entity);
	}

	/**
	 * 数据更新后
	 */
	@Override
	protected void onAfterSave(T entity) {
		logger.debug("更新数据完成：" + entity.toString());
		super.onAfterSave(entity);
	}

	/**
	 * 数据删除前
	 */
	@Override
	protected void onBeforeDelete(T entity) {
		logger.debug("准备删除数据：" + entity.toString());
		super.onBeforeDelete(entity);
	}

	/**
	 * 数据删除后
	 */
	@Override
	protected void onAfterDelete(T entity) {
		logger.debug("删除数据完成：" + entity.toString());
		super.onAfterDelete(entity);
	}

	/**
	 * 数据保存前-link
	 */
	@Override
	protected void onBeforeLinkSave(T parent, Object linked) {
		logger.debug("准备保存数据（link）：" + parent.toString() + "---" + linked.toString());
		super.onBeforeLinkSave(parent, linked);
	}

	/**
	 * 数据保存后-link
	 */
	@Override
	protected void onAfterLinkSave(T parent, Object linked) {
		logger.debug("保存数据完成（link）：" + parent.toString() + "---" + linked.toString());
		super.onAfterLinkSave(parent, linked);
	}

	/**
	 * 数据删除前-link
	 */
	@Override
	protected void onBeforeLinkDelete(T parent, Object linked) {
		logger.debug("准备删除数据（link）：" + parent.toString() + "---" + linked.toString());
		super.onBeforeLinkDelete(parent, linked);
	}

	/**
	 * 数据删除后-link
	 */
	@Override
	protected void onAfterLinkDelete(T parent, Object linked) {
		logger.debug("删除数据完成（link）：" + parent.toString() + "---" + linked.toString());
		super.onAfterLinkDelete(parent, linked);
	}

}
