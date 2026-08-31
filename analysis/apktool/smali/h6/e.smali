.class public final Lh6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final q:Ljava/lang/Object;

.field public volatile r:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic s:Lh6/h;


# direct methods
.method public constructor <init>(Lh6/h;LH2/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh6/e;->s:Lh6/h;

    .line 5
    .line 6
    iput-object p2, p0, Lh6/e;->q:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lh6/e;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    const-string v0, "Callback failure for "

    .line 2
    .line 3
    const-string v1, "canceled due to "

    .line 4
    .line 5
    iget-object v2, p0, Lh6/e;->s:Lh6/h;

    .line 6
    .line 7
    iget-object v2, v2, Lh6/h;->r:Ld6/s;

    .line 8
    .line 9
    iget-object v2, v2, Ld6/s;->a:Ld6/n;

    .line 10
    .line 11
    invoke-virtual {v2}, Ld6/n;->f()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "OkHttp "

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lh6/e;->s:Lh6/h;

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v2, v3, Lh6/h;->t:Lh6/g;

    .line 35
    .line 36
    invoke-virtual {v2}, Lq6/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :try_start_1
    invoke-virtual {v3}, Lh6/h;->g()Ld6/u;

    .line 41
    .line 42
    .line 43
    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 44
    const/4 v6, 0x1

    .line 45
    :try_start_2
    iget-object v7, p0, Lh6/e;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, LH2/g;

    .line 48
    .line 49
    iget v8, v7, LH2/g;->q:I

    .line 50
    .line 51
    packed-switch v8, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    iget-object v7, v7, LH2/g;->s:LM5/h;

    .line 55
    .line 56
    invoke-virtual {v7, v2}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_0
    iget-object v7, v7, LH2/g;->s:LM5/h;

    .line 61
    .line 62
    invoke-virtual {v7, v2}, LM5/h;->resumeWith(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    .line 64
    .line 65
    :goto_0
    :try_start_3
    iget-object v0, v3, Lh6/h;->q:Ld6/q;

    .line 66
    .line 67
    iget-object v0, v0, Ld6/q;->q:LE/c0;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v0, p0}, LE/c0;->j(Lh6/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_8

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto :goto_a

    .line 75
    :goto_2
    move v2, v6

    .line 76
    goto :goto_4

    .line 77
    :goto_3
    move v2, v6

    .line 78
    goto :goto_6

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :catch_0
    move-exception v1

    .line 82
    goto :goto_3

    .line 83
    :catchall_2
    move-exception v0

    .line 84
    :goto_4
    :try_start_4
    invoke-virtual {v3}, Lh6/h;->d()V

    .line 85
    .line 86
    .line 87
    if-nez v2, :cond_0

    .line 88
    .line 89
    new-instance v2, Ljava/io/IOException;

    .line 90
    .line 91
    new-instance v6, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v2, v0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lh6/e;->q:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, LH2/g;

    .line 112
    .line 113
    invoke-virtual {v1, v3, v2}, LH2/g;->a(Lh6/h;Ljava/io/IOException;)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :catchall_3
    move-exception v0

    .line 118
    goto :goto_9

    .line 119
    :cond_0
    :goto_5
    throw v0

    .line 120
    :catch_1
    move-exception v1

    .line 121
    :goto_6
    if-eqz v2, :cond_1

    .line 122
    .line 123
    sget-object v2, Ll6/m;->a:Ll6/m;

    .line 124
    .line 125
    sget-object v2, Ll6/m;->a:Ll6/m;

    .line 126
    .line 127
    new-instance v6, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v3}, Lh6/h;->a(Lh6/h;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/4 v2, 0x4

    .line 147
    invoke-static {v0, v2, v1}, Ll6/m;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_1
    iget-object v0, p0, Lh6/e;->q:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, LH2/g;

    .line 154
    .line 155
    invoke-virtual {v0, v3, v1}, LH2/g;->a(Lh6/h;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 156
    .line 157
    .line 158
    :goto_7
    :try_start_5
    iget-object v0, v3, Lh6/h;->q:Ld6/q;

    .line 159
    .line 160
    iget-object v0, v0, Ld6/q;->q:LE/c0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :goto_8
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :goto_9
    :try_start_6
    iget-object v1, v3, Lh6/h;->q:Ld6/q;

    .line 168
    .line 169
    iget-object v1, v1, Ld6/q;->q:LE/c0;

    .line 170
    .line 171
    invoke-virtual {v1, p0}, LE/c0;->j(Lh6/e;)V

    .line 172
    .line 173
    .line 174
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 175
    :goto_a
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
