.class public final synthetic LE4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LE4/h;->a:I

    iput-object p2, p0, LE4/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 9

    .line 1
    iget v0, p0, LE4/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE4/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz4/n;

    .line 9
    .line 10
    iget-object v1, v0, Lz4/n;->b:LE1/t;

    .line 11
    .line 12
    const-string v2, "reportBinderDeath"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    new-array v4, v3, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v4}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lz4/n;->i:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    iget-object v1, v0, Lz4/n;->b:LE1/t;

    .line 29
    .line 30
    iget-object v2, v0, Lz4/n;->c:Ljava/lang/String;

    .line 31
    .line 32
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v4, "%s : Binder has died."

    .line 37
    .line 38
    invoke-virtual {v1, v4, v2}, LE1/t;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lz4/n;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    check-cast v4, Lz4/k;

    .line 56
    .line 57
    new-instance v5, Landroid/os/RemoteException;

    .line 58
    .line 59
    iget-object v6, v0, Lz4/n;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const-string v7, " : Binder has died."

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-direct {v5, v6}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v4, v4, Lz4/k;->q:LS3/e;

    .line 75
    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    invoke-virtual {v4, v5}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v1, v0, Lz4/n;->d:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lz4/n;->f:Ljava/lang/Object;

    .line 88
    .line 89
    monitor-enter v1

    .line 90
    :try_start_0
    invoke-virtual {v0}, Lz4/n;->d()V

    .line 91
    .line 92
    .line 93
    monitor-exit v1

    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw v0

    .line 98
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :pswitch_0
    iget-object v0, p0, LE4/h;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, LE4/k;

    .line 107
    .line 108
    iget-object v1, v0, LE4/k;->c:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v2, v0, LE4/k;->b:LE4/f;

    .line 111
    .line 112
    const-string v3, "reportBinderDeath"

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    new-array v5, v4, [Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {v2, v3, v5}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object v3, v0, LE4/k;->i:Ljava/lang/ref/WeakReference;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const-string v5, "%s : Binder has died."

    .line 133
    .line 134
    invoke-virtual {v2, v5, v3}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, v0, LE4/k;->d:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    :cond_3
    :goto_1
    if-ge v4, v3, :cond_4

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    check-cast v5, LE4/g;

    .line 152
    .line 153
    new-instance v6, Landroid/os/RemoteException;

    .line 154
    .line 155
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    const-string v8, " : Binder has died."

    .line 160
    .line 161
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-direct {v6, v7}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v5, v5, LE4/g;->q:LS3/e;

    .line 169
    .line 170
    if-eqz v5, :cond_3

    .line 171
    .line 172
    invoke-virtual {v5, v6}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, LE4/k;->b()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_5
    new-instance v0, Ljava/lang/ClassCastException;

    .line 184
    .line 185
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 186
    .line 187
    .line 188
    throw v0

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
