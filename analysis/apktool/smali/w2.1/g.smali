.class public final Lw2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq6/l;

.field public final b:Lw2/e;


# direct methods
.method public constructor <init>(JLM5/s;Lq6/l;Lq6/x;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lw2/g;->a:Lq6/l;

    .line 5
    .line 6
    new-instance v0, Lw2/e;

    .line 7
    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lw2/e;-><init>(JLM5/s;Lq6/l;Lq6/x;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lw2/g;->b:Lw2/e;

    .line 16
    .line 17
    return-void
.end method
