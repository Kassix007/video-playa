.class public final synthetic LR4/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LR4/f3;->q:I

    iput-object p1, p0, LR4/f3;->r:Ljava/lang/Object;

    iput-object p2, p0, LR4/f3;->s:Ljava/lang/Object;

    iput-object p3, p0, LR4/f3;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    iget p2, p0, LR4/f3;->q:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LR4/f3;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Le5/a;

    .line 9
    .line 10
    iget-object v0, p0, LR4/f3;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Le5/b;

    .line 13
    .line 14
    iget-object v1, p0, LR4/f3;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LB5/a;

    .line 17
    .line 18
    iget-object v0, v0, Le5/b;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p2, p2, Le5/a;->q:Landroid/database/sqlite/SQLiteDatabase;

    .line 27
    .line 28
    const-string v2, "Select * from NotificationData where id=?"

    .line 29
    .line 30
    filled-new-array {v0}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {p2, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "rawQuery(...)"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-lez v3, :cond_0

    .line 48
    .line 49
    const-string v3, "id=?"

    .line 50
    .line 51
    filled-new-array {v0}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v4, "NotificationData"

    .line 56
    .line 57
    invoke-virtual {p2, v4, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_0
    iget-object p1, p0, LR4/f3;->r:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Landroid/widget/EditText;

    .line 73
    .line 74
    iget-object p2, p0, LR4/f3;->s:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, Landroid/widget/EditText;

    .line 77
    .line 78
    iget-object v0, p0, LR4/f3;->t:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lk3/c;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Landroid/webkit/HttpAuthHandler;

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    invoke-virtual {v0, p1, p2}, Landroid/webkit/HttpAuthHandler;->proceed(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
