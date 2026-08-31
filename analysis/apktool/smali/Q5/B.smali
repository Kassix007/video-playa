.class public final LQ5/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final q:LO5/w;


# direct methods
.method public constructor <init>(LO5/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ5/B;->q:LO5/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/B;->q:LO5/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LO5/w;->k(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 13
    .line 14
    return-object p1
.end method
