.class public final LI2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(LI2/g;)V
    .locals 5

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iget-object v0, p1, LI2/g;->a:Ljava/util/List;

    .line 14
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->a:Ljava/util/ArrayList;

    .line 15
    iget-object v0, p1, LI2/g;->b:Ljava/util/List;

    .line 16
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->b:Ljava/util/ArrayList;

    .line 17
    iget-object v0, p1, LI2/g;->c:Ljava/util/List;

    .line 18
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->c:Ljava/util/ArrayList;

    .line 19
    iget-object v0, p1, LI2/g;->f:Lm5/o;

    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 20
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 22
    check-cast v2, Lm5/j;

    .line 23
    new-instance v3, LI2/d;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 24
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_0
    iput-object v1, p0, LI2/f;->d:Ljava/util/ArrayList;

    .line 26
    iget-object p1, p1, LI2/g;->g:Lm5/o;

    invoke-virtual {p1}, Lm5/o;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 27
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 29
    check-cast v1, LJ2/j;

    .line 30
    new-instance v2, LI2/c;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, LI2/c;-><init>(LJ2/j;I)V

    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 32
    :cond_1
    iput-object v0, p0, LI2/f;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Lt2/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lt2/b;->a:Ljava/util/List;

    .line 3
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->a:Ljava/util/ArrayList;

    .line 4
    iget-object v0, p1, Lt2/b;->b:Ljava/util/List;

    .line 5
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->b:Ljava/util/ArrayList;

    .line 6
    iget-object v0, p1, Lt2/b;->c:Ljava/util/List;

    .line 7
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->c:Ljava/util/ArrayList;

    .line 8
    iget-object v0, p1, Lt2/b;->d:Ljava/util/List;

    .line 9
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LI2/f;->d:Ljava/util/ArrayList;

    .line 10
    iget-object p1, p1, Lt2/b;->e:Ljava/util/List;

    .line 11
    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, LI2/f;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(LA2/a;Ljava/lang/Class;)V
    .locals 1

    .line 1
    new-instance v0, Lm5/j;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LI2/f;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(LL2/f;Lkotlin/jvm/internal/f;)V
    .locals 2

    .line 1
    new-instance v0, LI2/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2}, LI2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LI2/f;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c(LO2/a;Lkotlin/jvm/internal/f;)V
    .locals 1

    .line 1
    new-instance v0, Lm5/j;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LI2/f;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(Lx2/f;Ljava/lang/Class;)V
    .locals 1

    .line 1
    new-instance v0, Lm5/j;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LI2/f;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
