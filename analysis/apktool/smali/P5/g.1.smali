.class public final LP5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/h;


# instance fields
.field public final q:LP5/h;


# direct methods
.method public constructor <init>(LP5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP5/g;->q:LP5/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final collect(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LQ5/c;->b:LE4/f;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, LP5/f;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, LP5/f;-><init>(LP5/g;Lkotlin/jvm/internal/y;LP5/i;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LP5/g;->q:LP5/h;

    .line 16
    .line 17
    invoke-interface {p1, v1, p2}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1
.end method
