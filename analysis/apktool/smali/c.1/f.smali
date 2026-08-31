.class public final Lc/f;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/u;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/u;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/f;->q:Lkotlin/jvm/internal/u;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP5/i;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Lq5/c;

    .line 6
    .line 7
    new-instance p1, Lc/f;

    .line 8
    .line 9
    iget-object p2, p0, Lc/f;->q:Lkotlin/jvm/internal/u;

    .line 10
    .line 11
    invoke-direct {p1, p2, p3}, Lc/f;-><init>(Lkotlin/jvm/internal/u;Lq5/c;)V

    .line 12
    .line 13
    .line 14
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lc/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lc/f;->q:Lkotlin/jvm/internal/u;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p1, Lkotlin/jvm/internal/u;->q:Z

    .line 8
    .line 9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    return-object p1
.end method
