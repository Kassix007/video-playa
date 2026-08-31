.class public final LC/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/q;


# instance fields
.field public final a:La5/w;

.field public final b:LX/e;


# direct methods
.method public constructor <init>(La5/w;LX/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC/f;->a:La5/w;

    .line 5
    .line 6
    iput-object p2, p0, LC/f;->b:LX/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LB5/c;
    .locals 1

    .line 1
    iget-object v0, p0, LC/f;->a:La5/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKey()LB5/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
