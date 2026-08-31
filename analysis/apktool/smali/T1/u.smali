.class public final LT1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LW1/j;

.field public final c:LC3/b;

.field public final d:Landroid/app/Activity;

.field public e:Z

.field public final f:LJ1/z;

.field public final g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LT1/u;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance v0, LW1/j;

    .line 12
    .line 13
    new-instance v1, LT1/f;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, v2}, LT1/f;-><init>(LT1/u;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, LW1/j;-><init>(LT1/u;LT1/f;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LT1/u;->b:LW1/j;

    .line 23
    .line 24
    new-instance v0, LC3/b;

    .line 25
    .line 26
    invoke-direct {v0, p1}, LC3/b;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LT1/u;->c:LC3/b;

    .line 30
    .line 31
    new-instance v0, LI5/m;

    .line 32
    .line 33
    const/16 v1, 0xc

    .line 34
    .line 35
    invoke-direct {v0, v1}, LI5/m;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0}, LI5/k;->R(Ljava/lang/Object;LB5/c;)LI5/i;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v1, v0

    .line 57
    check-cast v1, Landroid/content/Context;

    .line 58
    .line 59
    instance-of v1, v1, Landroid/app/Activity;

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v0, 0x0

    .line 65
    :goto_0
    check-cast v0, Landroid/app/Activity;

    .line 66
    .line 67
    iput-object v0, p0, LT1/u;->d:Landroid/app/Activity;

    .line 68
    .line 69
    new-instance p1, LJ1/z;

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-direct {p1, v0, p0}, LJ1/z;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, LT1/u;->f:LJ1/z;

    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, LT1/u;->g:Z

    .line 79
    .line 80
    iget-object p1, p0, LT1/u;->b:LW1/j;

    .line 81
    .line 82
    iget-object p1, p1, LW1/j;->s:LT1/A;

    .line 83
    .line 84
    new-instance v0, LT1/t;

    .line 85
    .line 86
    invoke-direct {v0, p1}, LT1/t;-><init>(LT1/A;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, LT1/A;->a(LT1/z;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, LT1/u;->b:LW1/j;

    .line 93
    .line 94
    iget-object p1, p1, LW1/j;->s:LT1/A;

    .line 95
    .line 96
    new-instance v0, LT1/b;

    .line 97
    .line 98
    iget-object v1, p0, LT1/u;->a:Landroid/content/Context;

    .line 99
    .line 100
    invoke-direct {v0, v1}, LT1/b;-><init>(Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, LT1/A;->a(LT1/z;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, LT1/f;

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    invoke-direct {p1, p0, v0}, LT1/f;-><init>(LT1/u;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public static b(LT1/u;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "route"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, LT1/u;->b:LW1/j;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LW1/j;->c:LT1/r;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, LW1/j;->i()LT1/r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, p1, v1, v0}, LT1/r;->j(Ljava/lang/String;ZLT1/p;)LT1/o;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object p1, v0, LT1/o;->q:LT1/p;

    .line 30
    .line 31
    iget-object v0, v0, LT1/o;->r:Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    new-array v1, v0, [Lm5/j;

    .line 41
    .line 42
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, [Lm5/j;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_0
    sget v1, LT1/p;->u:I

    .line 53
    .line 54
    iget-object v1, p1, LT1/p;->r:LW1/l;

    .line 55
    .line 56
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const-string v2, "android-app://androidx.navigation/"

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const-string v1, ""

    .line 70
    .line 71
    :goto_0
    const-string v2, "uriString"

    .line 72
    .line 73
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "parse(...)"

    .line 81
    .line 82
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Landroid/content/Intent;

    .line 86
    .line 87
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 88
    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    const-string v1, "android-support-nav:controller:deepLinkIntent"

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, v0, v3}, LW1/j;->k(LT1/p;Landroid/os/Bundle;LT1/w;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v2, "Navigation destination that matches route "

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p1, " cannot be found in the navigation graph "

    .line 119
    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, LW1/j;->c:LT1/r;

    .line 124
    .line 125
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v1, "Cannot navigate to "

    .line 139
    .line 140
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string p1, ". Navigation graph has not been set for NavController "

    .line 147
    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const/16 p0, 0x2e

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1
.end method


# virtual methods
.method public final a()LT1/d;
    .locals 3

    .line 1
    iget-object v0, p0, LT1/u;->b:LW1/j;

    .line 2
    .line 3
    iget-object v0, v0, LW1/j;->f:Ln5/j;

    .line 4
    .line 5
    invoke-static {v0}, Ln5/l;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {v0}, LI5/k;->Q(Ljava/util/Iterator;)LI5/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, LI5/a;

    .line 27
    .line 28
    invoke-virtual {v0}, LI5/a;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, LT1/d;

    .line 44
    .line 45
    iget-object v2, v2, LT1/d;->r:LT1/p;

    .line 46
    .line 47
    instance-of v2, v2, LT1/r;

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v1, 0x0

    .line 53
    :goto_0
    check-cast v1, LT1/d;

    .line 54
    .line 55
    return-object v1
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LT1/u;->b:LW1/j;

    .line 2
    .line 3
    iget-object v1, v0, LW1/j;->f:Ln5/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ln5/j;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, LW1/j;->f()LT1/p;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 20
    .line 21
    iget v1, v1, LW1/l;->a:I

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v3}, LW1/j;->l(IZZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, LW1/j;->b()Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LT1/u;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LT1/u;->b:LW1/j;

    .line 13
    .line 14
    iget-object v1, v0, LW1/j;->m:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    const-string v4, "android-support-nav:controller:navigatorState"

    .line 23
    .line 24
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    invoke-static {v4, p1}, Lcom/google/android/gms/internal/measurement/I1;->k0(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object v4, v2

    .line 36
    :goto_0
    iput-object v4, v0, LW1/j;->d:Landroid/os/Bundle;

    .line 37
    .line 38
    const-string v4, "android-support-nav:controller:backStack"

    .line 39
    .line 40
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    invoke-static {v4, p1}, Lcom/google/android/gms/internal/measurement/I1;->l0(Ljava/lang/String;Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    new-array v5, v3, [Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, [Landroid/os/Bundle;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v4, v2

    .line 60
    :goto_1
    iput-object v4, v0, LW1/j;->e:[Landroid/os/Bundle;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 63
    .line 64
    .line 65
    const-string v4, "android-support-nav:controller:backStackDestIds"

    .line 66
    .line 67
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_7

    .line 72
    .line 73
    const-string v5, "android-support-nav:controller:backStackIds"

    .line 74
    .line 75
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_7

    .line 80
    .line 81
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-eqz v6, :cond_6

    .line 86
    .line 87
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    array-length v5, v6

    .line 94
    move v7, v3

    .line 95
    move v8, v7

    .line 96
    :goto_2
    if-ge v7, v5, :cond_7

    .line 97
    .line 98
    aget v9, v6, v7

    .line 99
    .line 100
    add-int/lit8 v10, v8, 0x1

    .line 101
    .line 102
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    iget-object v11, v0, LW1/j;->l:Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    const-string v13, ""

    .line 113
    .line 114
    invoke-static {v12, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-nez v12, :cond_4

    .line 119
    .line 120
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    check-cast v8, Ljava/lang/String;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move-object v8, v2

    .line 128
    :goto_3
    invoke-interface {v11, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    add-int/lit8 v7, v7, 0x1

    .line 132
    .line 133
    move v8, v10

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/K1;->x(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v2

    .line 139
    :cond_6
    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/K1;->x(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v2

    .line 143
    :cond_7
    const-string v0, "android-support-nav:controller:backStackStates"

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_b

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    if-eqz v4, :cond_a

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    move v5, v3

    .line 162
    :cond_8
    :goto_4
    if-ge v5, v0, :cond_b

    .line 163
    .line 164
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    add-int/lit8 v5, v5, 0x1

    .line 169
    .line 170
    check-cast v6, Ljava/lang/String;

    .line 171
    .line 172
    new-instance v7, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v8, "android-support-nav:controller:backStackStates:"

    .line 175
    .line 176
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    const-string v9, "key"

    .line 187
    .line 188
    invoke-static {v7, v9}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_8

    .line 196
    .line 197
    new-instance v7, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-static {v7, p1}, Lcom/google/android/gms/internal/measurement/I1;->l0(Ljava/lang/String;Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    new-instance v8, Ln5/j;

    .line 214
    .line 215
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    invoke-direct {v8, v9}, Ln5/j;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    move v10, v3

    .line 227
    :goto_5
    if-ge v10, v9, :cond_9

    .line 228
    .line 229
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    add-int/lit8 v10, v10, 0x1

    .line 234
    .line 235
    check-cast v11, Landroid/os/Bundle;

    .line 236
    .line 237
    new-instance v12, LT1/e;

    .line 238
    .line 239
    invoke-direct {v12, v11}, LT1/e;-><init>(Landroid/os/Bundle;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8, v12}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    invoke-interface {v1, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_a
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/K1;->x(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v2

    .line 254
    :cond_b
    :goto_6
    if-eqz p1, :cond_e

    .line 255
    .line 256
    const-string v0, "android-support-nav:controller:deepLinkHandled"

    .line 257
    .line 258
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_c

    .line 263
    .line 264
    const/4 v4, 0x1

    .line 265
    invoke-virtual {p1, v0, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-ne p1, v4, :cond_c

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_c
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    :goto_7
    if-eqz v2, :cond_d

    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    :cond_d
    iput-boolean v3, p0, LT1/u;->e:Z

    .line 283
    .line 284
    :cond_e
    return-void
.end method

.method public final e()Landroid/os/Bundle;
    .locals 15

    .line 1
    iget-object v0, p0, LT1/u;->b:LW1/j;

    .line 2
    .line 3
    iget-object v1, v0, LW1/j;->m:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-object v2, v0, LW1/j;->f:Ln5/j;

    .line 6
    .line 7
    iget-object v3, v0, LW1/j;->l:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    new-array v6, v5, [Lm5/j;

    .line 16
    .line 17
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    check-cast v6, [Lm5/j;

    .line 22
    .line 23
    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    iget-object v0, v0, LW1/j;->s:LT1/A;

    .line 28
    .line 29
    iget-object v0, v0, LT1/A;->a:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-static {v0}, Ln5/x;->O(Ljava/util/Map;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    check-cast v8, Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, LT1/z;

    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    new-array v0, v5, [Lm5/j;

    .line 78
    .line 79
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, [Lm5/j;

    .line 84
    .line 85
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v7, "android-support-nav:controller:navigatorState:names"

    .line 90
    .line 91
    invoke-static {v6, v7, v4}, Lcom/google/android/gms/internal/measurement/P1;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    const-string v4, "android-support-nav:controller:navigatorState"

    .line 95
    .line 96
    invoke-static {v0, v4, v6}, Lcom/google/android/gms/internal/measurement/P1;->H(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    const/4 v0, 0x0

    .line 101
    :goto_1
    invoke-virtual {v2}, Ln5/j;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const-string v6, "nav-entry-state:saved-state"

    .line 106
    .line 107
    const-string v7, "nav-entry-state:args"

    .line 108
    .line 109
    const-string v8, "nav-entry-state:destination-id"

    .line 110
    .line 111
    const-string v9, "nav-entry-state:id"

    .line 112
    .line 113
    if-nez v4, :cond_5

    .line 114
    .line 115
    if-nez v0, :cond_2

    .line 116
    .line 117
    new-array v0, v5, [Lm5/j;

    .line 118
    .line 119
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, [Lm5/j;

    .line 124
    .line 125
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_4

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    check-cast v10, LT1/d;

    .line 149
    .line 150
    const-string v11, "entry"

    .line 151
    .line 152
    invoke-static {v10, v11}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v11, v10, LT1/d;->r:LT1/p;

    .line 156
    .line 157
    iget-object v11, v11, LT1/p;->r:LW1/l;

    .line 158
    .line 159
    iget v11, v11, LW1/l;->a:I

    .line 160
    .line 161
    iget-object v12, v10, LT1/d;->v:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v10, v10, LT1/d;->x:LW1/c;

    .line 164
    .line 165
    invoke-virtual {v10}, LW1/c;->a()Landroid/os/Bundle;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    new-array v14, v5, [Lm5/j;

    .line 170
    .line 171
    invoke-static {v14, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    check-cast v14, [Lm5/j;

    .line 176
    .line 177
    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    iget-object v10, v10, LW1/c;->h:LZ/m;

    .line 182
    .line 183
    invoke-virtual {v10, v14}, LZ/m;->A(Landroid/os/Bundle;)V

    .line 184
    .line 185
    .line 186
    new-array v10, v5, [Lm5/j;

    .line 187
    .line 188
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    check-cast v10, [Lm5/j;

    .line 193
    .line 194
    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    invoke-static {v9, v12, v10}, Lcom/google/android/gms/internal/measurement/P1;->I(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v8, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    if-nez v13, :cond_3

    .line 205
    .line 206
    new-array v11, v5, [Lm5/j;

    .line 207
    .line 208
    invoke-static {v11, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    check-cast v11, [Lm5/j;

    .line 213
    .line 214
    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    :cond_3
    invoke-static {v10, v7, v13}, Lcom/google/android/gms/internal/measurement/P1;->H(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v10, v6, v14}, Lcom/google/android/gms/internal/measurement/P1;->H(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_4
    const-string v2, "android-support-nav:controller:backStack"

    .line 229
    .line 230
    invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 231
    .line 232
    .line 233
    :cond_5
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-nez v2, :cond_9

    .line 238
    .line 239
    if-nez v0, :cond_6

    .line 240
    .line 241
    new-array v0, v5, [Lm5/j;

    .line 242
    .line 243
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, [Lm5/j;

    .line 248
    .line 249
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :cond_6
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    new-array v2, v2, [I

    .line 258
    .line 259
    new-instance v4, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    move v10, v5

    .line 273
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-eqz v11, :cond_8

    .line 278
    .line 279
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    check-cast v11, Ljava/util/Map$Entry;

    .line 284
    .line 285
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    check-cast v12, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    check-cast v11, Ljava/lang/String;

    .line 300
    .line 301
    add-int/lit8 v13, v10, 0x1

    .line 302
    .line 303
    aput v12, v2, v10

    .line 304
    .line 305
    if-nez v11, :cond_7

    .line 306
    .line 307
    const-string v11, ""

    .line 308
    .line 309
    :cond_7
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move v10, v13

    .line 313
    goto :goto_3

    .line 314
    :cond_8
    const-string v3, "android-support-nav:controller:backStackDestIds"

    .line 315
    .line 316
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 317
    .line 318
    .line 319
    const-string v2, "android-support-nav:controller:backStackIds"

    .line 320
    .line 321
    invoke-static {v0, v2, v4}, Lcom/google/android/gms/internal/measurement/P1;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 322
    .line 323
    .line 324
    :cond_9
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-nez v2, :cond_e

    .line 329
    .line 330
    if-nez v0, :cond_a

    .line 331
    .line 332
    new-array v0, v5, [Lm5/j;

    .line 333
    .line 334
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, [Lm5/j;

    .line 339
    .line 340
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-eqz v3, :cond_d

    .line 362
    .line 363
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Ljava/util/Map$Entry;

    .line 368
    .line 369
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    check-cast v4, Ljava/lang/String;

    .line 374
    .line 375
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    check-cast v3, Ln5/j;

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    new-instance v10, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    if-eqz v11, :cond_c

    .line 398
    .line 399
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v11

    .line 403
    check-cast v11, LT1/e;

    .line 404
    .line 405
    iget-object v11, v11, LT1/e;->a:LW1/d;

    .line 406
    .line 407
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    new-array v12, v5, [Lm5/j;

    .line 411
    .line 412
    invoke-static {v12, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v12

    .line 416
    check-cast v12, [Lm5/j;

    .line 417
    .line 418
    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    iget-object v13, v11, LW1/d;->b:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v13, Ljava/lang/String;

    .line 425
    .line 426
    invoke-static {v9, v13, v12}, Lcom/google/android/gms/internal/measurement/P1;->I(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 427
    .line 428
    .line 429
    iget v13, v11, LW1/d;->a:I

    .line 430
    .line 431
    invoke-virtual {v12, v8, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 432
    .line 433
    .line 434
    iget-object v13, v11, LW1/d;->c:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v13, Landroid/os/Bundle;

    .line 437
    .line 438
    if-nez v13, :cond_b

    .line 439
    .line 440
    new-array v13, v5, [Lm5/j;

    .line 441
    .line 442
    invoke-static {v13, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    check-cast v13, [Lm5/j;

    .line 447
    .line 448
    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    :cond_b
    invoke-static {v12, v7, v13}, Lcom/google/android/gms/internal/measurement/P1;->H(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 453
    .line 454
    .line 455
    iget-object v11, v11, LW1/d;->d:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v11, Landroid/os/Bundle;

    .line 458
    .line 459
    invoke-static {v12, v6, v11}, Lcom/google/android/gms/internal/measurement/P1;->H(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    goto :goto_5

    .line 466
    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    const-string v11, "android-support-nav:controller:backStackStates:"

    .line 469
    .line 470
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    const-string v4, "key"

    .line 481
    .line 482
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v3, v10}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 486
    .line 487
    .line 488
    goto/16 :goto_4

    .line 489
    .line 490
    :cond_d
    const-string v1, "android-support-nav:controller:backStackStates"

    .line 491
    .line 492
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 493
    .line 494
    .line 495
    :cond_e
    iget-boolean v1, p0, LT1/u;->e:Z

    .line 496
    .line 497
    if-eqz v1, :cond_10

    .line 498
    .line 499
    if-nez v0, :cond_f

    .line 500
    .line 501
    new-array v0, v5, [Lm5/j;

    .line 502
    .line 503
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    check-cast v0, [Lm5/j;

    .line 508
    .line 509
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    :cond_f
    const-string v1, "android-support-nav:controller:deepLinkHandled"

    .line 514
    .line 515
    iget-boolean v2, p0, LT1/u;->e:Z

    .line 516
    .line 517
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 518
    .line 519
    .line 520
    :cond_10
    return-object v0
.end method
