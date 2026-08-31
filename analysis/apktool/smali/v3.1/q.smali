.class public final Lv3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ly3/a;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ly3/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lv3/q;->q:I

    iput-object p1, p0, Lv3/q;->s:Ljava/lang/Object;

    iput-object p2, p0, Lv3/q;->r:Ly3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lv3/q;->q:I

    .line 2
    .line 3
    const-string v1, "GoogleApiManager"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lv3/q;->r:Ly3/a;

    .line 8
    .line 9
    iget-object v5, p0, Lv3/q;->s:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, Lv3/x;

    .line 15
    .line 16
    check-cast v4, LR3/e;

    .line 17
    .line 18
    iget-object v0, v4, LR3/e;->r:Lcom/google/android/gms/common/b;

    .line 19
    .line 20
    iget v6, v0, Lcom/google/android/gms/common/b;->r:I

    .line 21
    .line 22
    if-nez v6, :cond_5

    .line 23
    .line 24
    iget-object v0, v4, LR3/e;->s:Lx3/t;

    .line 25
    .line 26
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, v0, Lx3/t;->s:Lcom/google/android/gms/common/b;

    .line 30
    .line 31
    iget v6, v4, Lcom/google/android/gms/common/b;->r:I

    .line 32
    .line 33
    if-nez v6, :cond_4

    .line 34
    .line 35
    iget-object v4, v5, Lv3/x;->j:LF/D;

    .line 36
    .line 37
    iget-object v0, v0, Lx3/t;->r:Landroid/os/IBinder;

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget v3, Lx3/a;->d:I

    .line 43
    .line 44
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 45
    .line 46
    invoke-interface {v0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    instance-of v7, v6, Lx3/i;

    .line 51
    .line 52
    if-eqz v7, :cond_1

    .line 53
    .line 54
    move-object v3, v6

    .line 55
    check-cast v3, Lx3/i;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v6, Lx3/M;

    .line 59
    .line 60
    invoke-direct {v6, v0, v3, v2}, LI3/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    move-object v3, v6

    .line 64
    :goto_0
    iget-object v0, v5, Lv3/x;->g:Ljava/util/Set;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iput-object v3, v4, LF/D;->t:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v0, v4, LF/D;->u:Ljava/lang/Object;

    .line 77
    .line 78
    iget-boolean v1, v4, LF/D;->q:Z

    .line 79
    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    iget-object v1, v4, LF/D;->r:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lu3/b;

    .line 85
    .line 86
    invoke-interface {v1, v3, v0}, Lu3/b;->m(Lx3/i;Ljava/util/Set;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/Exception;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v2, "Received null response from onSignInSuccess"

    .line 96
    .line 97
    invoke-static {v1, v2, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 98
    .line 99
    .line 100
    new-instance v0, Lcom/google/android/gms/common/b;

    .line 101
    .line 102
    const/4 v1, 0x4

    .line 103
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/b;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v0}, LF/D;->a(Lcom/google/android/gms/common/b;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v1, Ljava/lang/Exception;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v2, "SignInCoordinator"

    .line 120
    .line 121
    const-string v3, "Sign-in succeeded with resolve account failure: "

    .line 122
    .line 123
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v2, v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 128
    .line 129
    .line 130
    iget-object v0, v5, Lv3/x;->j:LF/D;

    .line 131
    .line 132
    invoke-virtual {v0, v4}, LF/D;->a(Lcom/google/android/gms/common/b;)V

    .line 133
    .line 134
    .line 135
    iget-object v0, v5, Lv3/x;->i:LR3/a;

    .line 136
    .line 137
    invoke-interface {v0}, Lu3/b;->j()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    iget-object v1, v5, Lv3/x;->j:LF/D;

    .line 142
    .line 143
    invoke-virtual {v1, v0}, LF/D;->a(Lcom/google/android/gms/common/b;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_2
    iget-object v0, v5, Lv3/x;->i:LR3/a;

    .line 147
    .line 148
    invoke-interface {v0}, Lu3/b;->j()V

    .line 149
    .line 150
    .line 151
    :goto_3
    return-void

    .line 152
    :pswitch_0
    check-cast v4, Lcom/google/android/gms/common/b;

    .line 153
    .line 154
    check-cast v5, LF/D;

    .line 155
    .line 156
    iget-object v0, v5, LF/D;->r:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lu3/b;

    .line 159
    .line 160
    iget-object v6, v5, LF/D;->v:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v6, Lv3/e;

    .line 163
    .line 164
    iget-object v6, v6, Lv3/e;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 165
    .line 166
    iget-object v7, v5, LF/D;->s:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v7, Lv3/a;

    .line 169
    .line 170
    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    check-cast v6, Lv3/o;

    .line 175
    .line 176
    if-nez v6, :cond_7

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_7
    iget v7, v4, Lcom/google/android/gms/common/b;->r:I

    .line 180
    .line 181
    if-nez v7, :cond_9

    .line 182
    .line 183
    iput-boolean v2, v5, LF/D;->q:Z

    .line 184
    .line 185
    invoke-interface {v0}, Lu3/b;->k()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_8

    .line 190
    .line 191
    iget-boolean v1, v5, LF/D;->q:Z

    .line 192
    .line 193
    if-eqz v1, :cond_a

    .line 194
    .line 195
    iget-object v1, v5, LF/D;->t:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, Lx3/i;

    .line 198
    .line 199
    if-eqz v1, :cond_a

    .line 200
    .line 201
    iget-object v2, v5, LF/D;->u:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, Ljava/util/Set;

    .line 204
    .line 205
    invoke-interface {v0, v1, v2}, Lu3/b;->m(Lx3/i;Ljava/util/Set;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_8
    :try_start_0
    invoke-interface {v0}, Lu3/b;->b()Ljava/util/Set;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-interface {v0, v3, v2}, Lu3/b;->m(Lx3/i;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :catch_0
    move-exception v2

    .line 218
    const-string v4, "Failed to get service from broker. "

    .line 219
    .line 220
    invoke-static {v1, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 221
    .line 222
    .line 223
    const-string v1, "Failed to get service from broker."

    .line 224
    .line 225
    invoke-interface {v0, v1}, Lu3/b;->d(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, Lcom/google/android/gms/common/b;

    .line 229
    .line 230
    const/16 v1, 0xa

    .line 231
    .line 232
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/b;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6, v0, v3}, Lv3/o;->l(Lcom/google/android/gms/common/b;Ljava/lang/RuntimeException;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    invoke-virtual {v6, v4, v3}, Lv3/o;->l(Lcom/google/android/gms/common/b;Ljava/lang/RuntimeException;)V

    .line 240
    .line 241
    .line 242
    :cond_a
    :goto_4
    return-void

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
