.class public final La5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La5/v;->q:I

    iput-object p2, p0, La5/v;->r:Ljava/lang/Object;

    iput-object p3, p0, La5/v;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LB5/a;LP/W;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La5/v;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/v;->s:Ljava/lang/Object;

    iput-object p2, p0, La5/v;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, La5/v;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La5/v;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk6/n;

    .line 9
    .line 10
    iget-object v1, p0, La5/v;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lk6/r;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    :try_start_0
    invoke-virtual {v1, v2, p0}, Lk6/r;->a(ZLa5/v;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    invoke-virtual {v1, v4, p0}, Lk6/r;->a(ZLa5/v;)Z

    .line 24
    .line 25
    .line 26
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    const/16 v4, 0x9

    .line 30
    .line 31
    invoke-virtual {v0, v2, v4, v3}, Lk6/n;->a(IILjava/io/IOException;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {v1}, Le6/b;->b(Ljava/io/Closeable;)V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    goto :goto_1

    .line 40
    :catch_0
    move-exception v2

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :try_start_1
    new-instance v2, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v4, "Required SETTINGS preface not received"

    .line 45
    .line 46
    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :goto_1
    const/4 v4, 0x3

    .line 51
    invoke-virtual {v0, v4, v4, v3}, Lk6/n;->a(IILjava/io/IOException;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Le6/b;->b(Ljava/io/Closeable;)V

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :goto_2
    const/4 v3, 0x2

    .line 59
    invoke-virtual {v0, v3, v3, v2}, Lk6/n;->a(IILjava/io/IOException;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_3
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    iget-object v0, p0, La5/v;->s:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, LP/W;

    .line 69
    .line 70
    iget-object v1, p0, La5/v;->r:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, LP/W;

    .line 73
    .line 74
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Le5/a;

    .line 79
    .line 80
    invoke-virtual {v1}, Le5/a;->a()Landroid/database/Cursor;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v0, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_1
    iget-object v0, p0, La5/v;->s:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, LB5/a;

    .line 93
    .line 94
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, La5/v;->r:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, LP/W;

    .line 100
    .line 101
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-interface {v0, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
