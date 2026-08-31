.class public final Lg6/b;
.super Lg6/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO3/Y;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg6/b;->e:I

    iput-object p1, p0, Lg6/b;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p2, p1}, Lg6/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lg6/b;->e:I

    iput-object p2, p0, Lg6/b;->f:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lg6/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 13

    .line 1
    iget v0, p0, Lg6/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg6/b;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk6/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    :try_start_0
    iget-object v2, v0, Lk6/n;->M:Lk6/w;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v2, v1, v3, v3}, Lk6/w;->n(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v2

    .line 22
    invoke-virtual {v0, v1, v1, v2}, Lk6/n;->a(IILjava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lg6/b;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LO3/Y;

    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    iget-object v3, v0, LO3/Y;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const-wide/high16 v6, -0x8000000000000000L

    .line 47
    .line 48
    move-wide v7, v6

    .line 49
    move-object v6, v5

    .line 50
    move v5, v4

    .line 51
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    check-cast v9, Lh6/j;

    .line 62
    .line 63
    const-string v10, "connection"

    .line 64
    .line 65
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    monitor-enter v9

    .line 69
    :try_start_1
    invoke-virtual {v0, v9, v1, v2}, LO3/Y;->b(Lh6/j;J)I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-lez v10, :cond_0

    .line 74
    .line 75
    add-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    iget-wide v10, v9, Lh6/j;->q:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    sub-long v10, v1, v10

    .line 83
    .line 84
    cmp-long v12, v10, v7

    .line 85
    .line 86
    if-lez v12, :cond_1

    .line 87
    .line 88
    move-object v6, v9

    .line 89
    move-wide v7, v10

    .line 90
    :cond_1
    :goto_2
    monitor-exit v9

    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    monitor-exit v9

    .line 94
    throw v0

    .line 95
    :cond_2
    iget-wide v9, v0, LO3/Y;->b:J

    .line 96
    .line 97
    cmp-long v3, v7, v9

    .line 98
    .line 99
    if-gez v3, :cond_6

    .line 100
    .line 101
    const/4 v3, 0x5

    .line 102
    if-le v4, v3, :cond_3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    if-lez v4, :cond_4

    .line 106
    .line 107
    sub-long/2addr v9, v7

    .line 108
    goto :goto_4

    .line 109
    :cond_4
    if-lez v5, :cond_5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    const-wide/16 v9, -0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    :goto_3
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    monitor-enter v6

    .line 119
    :try_start_2
    iget-object v3, v6, Lh6/j;->p:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    const-wide/16 v9, 0x0

    .line 126
    .line 127
    if-nez v3, :cond_7

    .line 128
    .line 129
    monitor-exit v6

    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :try_start_3
    iget-wide v3, v6, Lh6/j;->q:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    .line 133
    add-long/2addr v3, v7

    .line 134
    cmp-long v1, v3, v1

    .line 135
    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    monitor-exit v6

    .line 139
    goto :goto_4

    .line 140
    :cond_8
    const/4 v1, 0x1

    .line 141
    :try_start_4
    iput-boolean v1, v6, Lh6/j;->j:Z

    .line 142
    .line 143
    iget-object v1, v0, LO3/Y;->e:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 146
    .line 147
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 148
    .line 149
    .line 150
    monitor-exit v6

    .line 151
    iget-object v1, v6, Lh6/j;->d:Ljava/net/Socket;

    .line 152
    .line 153
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Le6/b;->c(Ljava/net/Socket;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v0, LO3/Y;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_9

    .line 168
    .line 169
    iget-object v0, v0, LO3/Y;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Lg6/c;

    .line 172
    .line 173
    invoke-virtual {v0}, Lg6/c;->a()V

    .line 174
    .line 175
    .line 176
    :cond_9
    :goto_4
    return-wide v9

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    monitor-exit v6

    .line 179
    throw v0

    .line 180
    :pswitch_1
    iget-object v0, p0, Lg6/b;->f:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, LB5/a;

    .line 183
    .line 184
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    const-wide/16 v0, -0x1

    .line 188
    .line 189
    return-wide v0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
