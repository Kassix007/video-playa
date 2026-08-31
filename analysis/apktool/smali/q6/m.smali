.class public abstract Lq6/m;
.super Lq6/l;
.source "SourceFile"


# instance fields
.field public final s:Lq6/l;


# direct methods
.method public constructor <init>(Lq6/l;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

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
    iput-object p1, p0, Lq6/m;->s:Lq6/l;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Lq6/x;)Le1/e;
    .locals 10

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq6/l;->K(Lq6/x;)Le1/e;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p1, Le1/e;->d:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lq6/x;

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    iget-boolean v2, p1, Le1/e;->b:Z

    .line 25
    .line 26
    iget-boolean v3, p1, Le1/e;->c:Z

    .line 27
    .line 28
    iget-object v0, p1, Le1/e;->e:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, Ljava/lang/Long;

    .line 32
    .line 33
    iget-object v0, p1, Le1/e;->f:Ljava/io/Serializable;

    .line 34
    .line 35
    move-object v6, v0

    .line 36
    check-cast v6, Ljava/lang/Long;

    .line 37
    .line 38
    iget-object v0, p1, Le1/e;->g:Ljava/io/Serializable;

    .line 39
    .line 40
    move-object v7, v0

    .line 41
    check-cast v7, Ljava/lang/Long;

    .line 42
    .line 43
    iget-object v0, p1, Le1/e;->h:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v8, v0

    .line 46
    check-cast v8, Ljava/lang/Long;

    .line 47
    .line 48
    iget-object p1, p1, Le1/e;->i:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v9, p1

    .line 51
    check-cast v9, Ljava/util/Map;

    .line 52
    .line 53
    const-string p1, "extras"

    .line 54
    .line 55
    invoke-static {v9, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Le1/e;

    .line 59
    .line 60
    invoke-direct/range {v1 .. v9}, Le1/e;-><init>(ZZLq6/x;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    return-object v1
.end method

.method public final M(Lq6/x;)Lq6/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq6/l;->M(Lq6/x;)Lq6/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public W(Lq6/x;Z)Lq6/E;
    .locals 1

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lq6/l;->W(Lq6/x;Z)Lq6/E;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final a(Lq6/x;)Lq6/E;
    .locals 1

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq6/l;->a(Lq6/x;)Lq6/E;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final a0(Lq6/x;)Lq6/G;
    .locals 1

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq6/l;->a0(Lq6/x;)Lq6/G;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final b(Lq6/x;Lq6/x;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "target"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lq6/l;->b(Lq6/x;Lq6/x;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq6/l;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lq6/x;)V
    .locals 1

    .line 1
    const-string v0, "dir"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq6/l;->e(Lq6/x;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f(Lq6/x;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lq6/l;->f(Lq6/x;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lkotlin/jvm/internal/f;->c()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x28

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lq6/m;->s:Lq6/l;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x29

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public final z(Lq6/x;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lq6/m;->s:Lq6/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq6/l;->z(Lq6/x;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lq6/x;

    .line 29
    .line 30
    const-string v2, "path"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const/4 v1, 0x1

    .line 44
    if-le p1, v1, :cond_1

    .line 45
    .line 46
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0
.end method
