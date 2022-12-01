package org.troel.template.persist.models;

public abstract class ModelPersist {
	
	public final ModelPersist save() {
		preSave();
		prePersist();
		System.out.println(String.format("Saving %s in database", this.getClass().getSimpleName()));
		postSave();
		return this;
	}
	
	public final ModelPersist update() {
		preUpdate();
		prePersist();
		System.out.println(String.format("Updating %s in database", this.getClass().getSimpleName()));
		postUpdate();
		return this;
	}
	
	public final void delete() {
		preDelete();
		System.out.println(String.format("Removing %s in database", this.getClass().getSimpleName()));
		postDelete();
	}
	
	protected abstract void preSave();
	protected void postSave() {}
	protected void prePersist() {}
	protected void preUpdate() {}
	protected void postUpdate() {}
	protected void preDelete() {}
	protected void postDelete() {}
}
