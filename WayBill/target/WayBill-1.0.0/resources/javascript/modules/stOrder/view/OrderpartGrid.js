Ext.define('StOrderModule.view.OrderpartGrid', {
	extend: 'Ext.grid.Panel',
	alias: 'widget.orderpartgrid',

    xtype: 'cell-editing',
	sortableColumns: false,
	enableColumnMove: false,
	enableColumnHide: false,

    /**
     * Component Init
     */
    initComponent: function() {
        var me = this;
        var store = Ext.create('StOrderModule.store.Orderpart');

        // Copy properties to Origin Object
        Ext.apply(this, {
        	store: store,
        	tools: [{
        		type: 'maximize'
        	}],
            columns: [{ 
            	xtype: 'rownumberer',
                header: '序号',
            	width: 60
        	}, {
                header: '总成号',
                width: 260,
                dataIndex: 'partno'
            }, {
                header: '总成描述',
                width: 200,
                dataIndex: 'partdesc'
            }, {
                header: '运单号',
                width: 160,
                dataIndex: 'orderno'
            },  {
                header: '包装数',
                dataIndex: 'pkgcount',
                width: 90,
                align: 'right'
            }, {
                header: '数量',
                dataIndex: 'totalcount',
                width:90,
                align: 'right'
            }]
        });
        this.callParent(arguments);
    }
});