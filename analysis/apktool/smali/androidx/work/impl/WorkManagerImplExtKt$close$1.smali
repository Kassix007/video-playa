.class final Landroidx/work/impl/WorkManagerImplExtKt$close$1;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkManagerImplExtKt;->close(Landroidx/work/impl/WorkManagerImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls5/i;",
        "LB5/e;"
    }
.end annotation

.annotation runtime Ls5/e;
    c = "androidx.work.impl.WorkManagerImplExtKt$close$1"
    f = "WorkManagerImplExt.kt"
    l = {
        0x79
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $this_close:Landroidx/work/impl/WorkManagerImpl;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkManagerImpl;Lq5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/impl/WorkManagerImpl;",
            "Lq5/c<",
            "-",
            "Landroidx/work/impl/WorkManagerImplExtKt$close$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->$this_close:Landroidx/work/impl/WorkManagerImpl;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq5/c<",
            "*>;)",
            "Lq5/c<",
            "Lm5/y;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/work/impl/WorkManagerImplExtKt$close$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->$this_close:Landroidx/work/impl/WorkManagerImpl;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Landroidx/work/impl/WorkManagerImplExtKt$close$1;-><init>(Landroidx/work/impl/WorkManagerImpl;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LM5/w;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM5/w;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    move-result-object p1

    check-cast p1, Landroidx/work/impl/WorkManagerImplExtKt$close$1;

    sget-object p2, Lm5/y;->a:Lm5/y;

    invoke-virtual {p1, p2}, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LM5/w;

    check-cast p2, Lq5/c;

    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->invoke(LM5/w;Lq5/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->label:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->$this_close:Landroidx/work/impl/WorkManagerImpl;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/work/impl/WorkManagerImpl;->getWorkManagerScope()LM5/w;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object v0, LM5/t;->r:LM5/t;

    .line 36
    .line 37
    invoke-interface {p1, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, LM5/b0;

    .line 45
    .line 46
    iput v2, p0, Landroidx/work/impl/WorkManagerImplExtKt$close$1;->label:I

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-interface {p1, v0}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p0}, LM5/b0;->f(Ls5/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 57
    .line 58
    if-ne p1, v0, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object p1, v1

    .line 62
    :goto_0
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    :goto_1
    return-object v1
.end method
