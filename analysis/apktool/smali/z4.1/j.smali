.class public final Lz4/j;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ly4/c;


# direct methods
.method public synthetic constructor <init>(Ly4/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4/j;->a:Ly4/c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Lz4/j;->a:Ly4/c;

    .line 6
    .line 7
    const-string v3, "package.name"

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v2, v2, Ly4/c;->a:LE1/t;

    .line 24
    .line 25
    const-string v3, "package.name"

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v3, "ListenerRegistryBroadcastReceiver received broadcast for third party app: %s"

    .line 36
    .line 37
    invoke-virtual {v2, v3, v0}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v3, v2, Ly4/c;->a:LE1/t;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    new-array v5, v4, [Ljava/lang/Object;

    .line 45
    .line 46
    const-string v6, "List of extras in received intent:"

    .line 47
    .line 48
    invoke-virtual {v3, v6, v5}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v6, v2, Ly4/c;->a:LE1/t;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v7, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    filled-new-array {v5, v7}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const-string v7, "Key: %s; value: %s"

    .line 90
    .line 91
    invoke-virtual {v6, v7, v5}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    iget-object v3, v2, Ly4/c;->a:LE1/t;

    .line 96
    .line 97
    const-string v5, "List of extras in received intent needed by fromUpdateIntent:"

    .line 98
    .line 99
    new-array v6, v4, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {v3, v5, v6}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    const-string v5, "install.status"

    .line 105
    .line 106
    invoke-virtual {v0, v5, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    const-string v7, "Key: %s; value: %s"

    .line 119
    .line 120
    invoke-virtual {v3, v7, v6}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const-string v6, "error.code"

    .line 124
    .line 125
    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v3, v7, v8}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const-string v3, "total.bytes.to.download"

    .line 141
    .line 142
    const-string v7, "bytes.downloaded"

    .line 143
    .line 144
    const-string v8, "package.name"

    .line 145
    .line 146
    invoke-virtual {v0, v5, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    const-wide/16 v11, 0x0

    .line 151
    .line 152
    invoke-virtual {v0, v7, v11, v12}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v13

    .line 156
    invoke-virtual {v0, v3, v11, v12}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v11

    .line 160
    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    invoke-virtual {v0, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v16

    .line 168
    new-instance v9, Lcom/google/android/play/core/install/zza;

    .line 169
    .line 170
    move-wide/from16 v17, v13

    .line 171
    .line 172
    move-wide v13, v11

    .line 173
    move-wide/from16 v11, v17

    .line 174
    .line 175
    invoke-direct/range {v9 .. v16}, Lcom/google/android/play/core/install/zza;-><init>(IJJILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v2, Ly4/c;->a:LE1/t;

    .line 179
    .line 180
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    const-string v4, "ListenerRegistryBroadcastReceiver.onReceive: %s"

    .line 185
    .line 186
    invoke-virtual {v0, v4, v3}, LE1/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    monitor-enter v2

    .line 190
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    .line 191
    .line 192
    iget-object v3, v2, Ly4/c;->d:Ljava/util/HashSet;

    .line 193
    .line 194
    invoke-direct {v0, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_3

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, LY4/c;

    .line 212
    .line 213
    iget-object v3, v3, LY4/c;->a:LY4/d;

    .line 214
    .line 215
    iget v4, v9, Lcom/google/android/play/core/install/zza;->a:I

    .line 216
    .line 217
    const/16 v5, 0xb

    .line 218
    .line 219
    if-ne v4, v5, :cond_2

    .line 220
    .line 221
    invoke-virtual {v3}, LY4/d;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    goto :goto_2

    .line 227
    :cond_3
    monitor-exit v2

    .line 228
    return-void

    .line 229
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 230
    throw v0
.end method
