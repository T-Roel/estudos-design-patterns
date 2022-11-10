package org.troel.command.migration;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.troel.command.migration.commands.ProductTable;
import org.troel.command.migration.commands.UserTable;
import org.troel.command.migration.commands.UserTableRoleColumn;

public class Client {

	public static void main(String[] args) {
		Map<String, List<String>> database = new LinkedHashMap<>();
		MigrationTool tool = new MigrationTool();
		tool.addMigration(new UserTable(database));
		tool.addMigration(new ProductTable(database));
		tool.addMigration(new UserTableRoleColumn(database));
		
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.latest();
		System.out.println(database);
		
		tool.rollback();
		System.out.println(database);
	}
}
