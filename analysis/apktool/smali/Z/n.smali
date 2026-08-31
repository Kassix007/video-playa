.class public abstract LZ/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, LZ/d;->s:LZ/d;

    .line 2
    .line 3
    sget-object v1, LZ/e;->s:LZ/e;

    .line 4
    .line 5
    new-instance v2, LZ/m;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3, v0, v1}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sput-object v2, LZ/n;->a:LZ/m;

    .line 12
    .line 13
    return-void
.end method
