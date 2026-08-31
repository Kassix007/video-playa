.class public final Ly4/i;
.super Ly4/g;
.source "SourceFile"


# instance fields
.field public final synthetic g:Ly4/j;


# direct methods
.method public constructor <init>(Ly4/j;LS3/e;Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ly4/i;->g:Ly4/j;

    .line 2
    .line 3
    new-instance p3, LE1/t;

    .line 4
    .line 5
    const-string v0, "OnRequestInstallCallback"

    .line 6
    .line 7
    invoke-direct {p3, v0}, LE1/t;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p3, p2}, Ly4/g;-><init>(Ly4/j;LE1/t;LS3/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final f(Landroid/os/Bundle;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Ly4/g;->f(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "error.code"

    .line 9
    .line 10
    const/4 v3, -0x2

    .line 11
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iget-object v5, v0, Ly4/g;->e:LS3/e;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    new-instance v4, LA4/a;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v4, v1}, LA4/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v4}, LS3/e;->a(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const-string v2, "version.code"

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const-string v2, "update.availability"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const-string v2, "install.status"

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    const-string v2, "client.version.staleness"

    .line 53
    .line 54
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-ne v6, v3, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :goto_0
    const-string v2, "in.app.update.priority"

    .line 65
    .line 66
    invoke-virtual {v1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    const-string v2, "bytes.downloaded"

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 72
    .line 73
    .line 74
    const-string v2, "total.bytes.to.download"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    const-string v2, "additional.size.required"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v10

    .line 85
    iget-object v2, v0, Ly4/i;->g:Ly4/j;

    .line 86
    .line 87
    iget-object v2, v2, Ly4/j;->d:Ly4/k;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v3, Ljava/io/File;

    .line 93
    .line 94
    iget-object v2, v2, Ly4/k;->a:Landroid/content/Context;

    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v4, "assetpacks"

    .line 101
    .line 102
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v3}, Ly4/k;->a(Ljava/io/File;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    const-string v2, "blocking.intent"

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    move-object v14, v3

    .line 116
    check-cast v14, Landroid/app/PendingIntent;

    .line 117
    .line 118
    const-string v3, "nonblocking.intent"

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    move-object v15, v4

    .line 125
    check-cast v15, Landroid/app/PendingIntent;

    .line 126
    .line 127
    const-string v4, "blocking.destructive.intent"

    .line 128
    .line 129
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    move-object/from16 v16, v6

    .line 134
    .line 135
    check-cast v16, Landroid/app/PendingIntent;

    .line 136
    .line 137
    const-string v6, "nonblocking.destructive.intent"

    .line 138
    .line 139
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v17

    .line 143
    check-cast v17, Landroid/app/PendingIntent;

    .line 144
    .line 145
    new-instance v0, Ljava/util/HashMap;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 148
    .line 149
    .line 150
    move/from16 v18, v7

    .line 151
    .line 152
    const-string v7, "update.precondition.failures:blocking.destructive.intent"

    .line 153
    .line 154
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    move/from16 v19, v8

    .line 159
    .line 160
    new-instance v8, Ljava/util/HashSet;

    .line 161
    .line 162
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 163
    .line 164
    .line 165
    if-eqz v7, :cond_2

    .line 166
    .line 167
    invoke-virtual {v8, v7}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 168
    .line 169
    .line 170
    :cond_2
    invoke-virtual {v0, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    const-string v4, "update.precondition.failures:nonblocking.destructive.intent"

    .line 174
    .line 175
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    new-instance v7, Ljava/util/HashSet;

    .line 180
    .line 181
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 182
    .line 183
    .line 184
    if-eqz v4, :cond_3

    .line 185
    .line 186
    invoke-virtual {v7, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 187
    .line 188
    .line 189
    :cond_3
    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    const-string v4, "update.precondition.failures:blocking.intent"

    .line 193
    .line 194
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    new-instance v6, Ljava/util/HashSet;

    .line 199
    .line 200
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 201
    .line 202
    .line 203
    if-eqz v4, :cond_4

    .line 204
    .line 205
    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 206
    .line 207
    .line 208
    :cond_4
    invoke-virtual {v0, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    const-string v2, "update.precondition.failures:nonblocking.intent"

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    new-instance v2, Ljava/util/HashSet;

    .line 218
    .line 219
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 220
    .line 221
    .line 222
    if-eqz v1, :cond_5

    .line 223
    .line 224
    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 225
    .line 226
    .line 227
    :cond_5
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    new-instance v6, Ly4/a;

    .line 231
    .line 232
    move/from16 v7, v18

    .line 233
    .line 234
    move/from16 v8, v19

    .line 235
    .line 236
    invoke-direct/range {v6 .. v17}, Ly4/a;-><init>(IIIJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v6}, LS3/e;->b(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    return-void
.end method
