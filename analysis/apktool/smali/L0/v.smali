.class public final LL0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/l;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/n;

.field public final synthetic r:Lkotlin/jvm/internal/n;


# direct methods
.method public constructor <init>(LB5/e;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lkotlin/jvm/internal/n;

    .line 5
    .line 6
    iput-object p1, p0, LL0/v;->q:Lkotlin/jvm/internal/n;

    .line 7
    .line 8
    check-cast p2, Lkotlin/jvm/internal/n;

    .line 9
    .line 10
    iput-object p2, p0, LL0/v;->r:Lkotlin/jvm/internal/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(LZ/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LL0/v;->q:Lkotlin/jvm/internal/n;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LL0/v;->r:Lkotlin/jvm/internal/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
